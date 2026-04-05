# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run Commands

```bash
# Build
./gradlew build
./gradlew build -x test   # skip tests

# Run
./gradlew bootRun

# Test
./gradlew test
./gradlew test --tests "com.fan.limbus.SomeTest"   # single test

# Package for deployment
./gradlew bootJar
```

## Architecture

Spring Boot 3 REST API for a Limbus Company fan project. Java 17, Gradle.

**Layered structure under `src/main/java/com/fan/limbus/`:**

- `common/` — Cross-cutting config (e.g., `CorsConfig` allowing `localhost:3000` and `limbus-front.vercel.app`)
- `domain/<name>/` — Each domain has `controller/`, `service/`, `repository/`, `entity/` sub-packages

**Current domain:** `sinner` — exposes `GET /api/sinners` returning all sinner entities (id, name, description, imageUrl).

**Database:**
- Development: H2 in-memory, initialized via `src/main/resources/data.sql`
- Production: PostgreSQL via env vars `SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_USERNAME`, `SPRING_DATASOURCE_PASSWORD`
- DDL mode: `update`

**Deployment:** Heroku-style via `Procfile` (`java -jar build/libs/limbus-0.0.1-SNAPSHOT.jar`)

## Patterns

- Constructor injection via Lombok `@RequiredArgsConstructor`
- Standard Controller → Service → Repository stack
- New domains follow the same `domain/<name>/{controller,service,repository,entity}` package layout
