---
name: demo-api-scalar-galaxy-kotlin-sdk
description: "Kotlin SDK for Demo API (Scalar Galaxy). Use when writing Kotlin code that calls Demo API (Scalar Galaxy) with the com.demoapiscalargalaxy.api package: installing it, constructing and authenticating the client, and calling API operations."
---

# Demo API (Scalar Galaxy) Kotlin SDK

Generated Kotlin client for Demo API (Scalar Galaxy), published as `com.demoapiscalargalaxy.api`. Use the generated client instead of hand-writing HTTP requests.

## Install

```sh
./gradlew :demoApiScalarGalaxy-kotlin:build
```

## Client setup and authentication

```kotlin
import com.demoapiscalargalaxy.api.client.DemoApiScalarGalaxyClient
import com.demoapiscalargalaxy.api.client.okhttp.DemoApiScalarGalaxyOkHttpClient

val client: DemoApiScalarGalaxyClient =
    DemoApiScalarGalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build()
```

Provide credentials using the options below. Environment variables are read automatically when the target runtime supports them:

- `bearerAuth` (env: `BEARER_AUTH`) — JWT Bearer token authentication
- `basicAuthUsername` (env: `BASIC_AUTH_USERNAME`) — Basic HTTP authentication
- `basicAuthPassword` (env: `BASIC_AUTH_PASSWORD`) — Basic HTTP authentication
- `apiKeyHeader` (env: `API_KEY_HEADER`) — API key request header
- `apiKeyQuery` (env: `API_KEY_QUERY`) — API key query parameter
- `apiKeyCookie` (env: `API_KEY_COOKIE`) — API key browser cookie
- `oAuth2` (env: `O_AUTH2`) — OAuth 2.0 authentication
- `openIdConnect` (env: `OPEN_ID_CONNECT`) — OpenID Connect Authentication

## Calling operations

```kotlin
import com.demoapiscalargalaxy.api.client.DemoApiScalarGalaxyClient
import com.demoapiscalargalaxy.api.client.okhttp.DemoApiScalarGalaxyOkHttpClient
import com.demoapiscalargalaxy.api.models.planets.PlanetListParams

val client: DemoApiScalarGalaxyClient =
    DemoApiScalarGalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build()

val params = PlanetListParams.builder().limit(10L).offset(0L).build()
val planet = client.planets().list(params)

println(planet)
```

Method names, parameter shapes, and response types are generated from the API description — do not guess them. Look up the exact call signature in [api.md](./api.md) before writing a call.

## Error handling

Non-success responses throw generated API errors. Error objects expose status, headers, response body, and request metadata where the target runtime supports it.

```kotlin
import com.demoapiscalargalaxy.api.errors.DemoApiScalarGalaxyServiceException

try {
    val params = PlanetListParams.builder().limit(10L).offset(0L).build()
    val planet = client.planets().list(params)
} catch (err: DemoApiScalarGalaxyServiceException) {
    println("${err.statusCode()} ${err.body()}")
    throw err
}
```

## Requirements

- Java 8 or later
- Gradle multi-module project rooted at `demoApiScalarGalaxy-kotlin-root`, built with JDK 21

## Reference files

- [README.md](./README.md) — full feature tour: client options, request options, retries and timeouts, logging.
- [api.md](./api.md) — complete catalogue of every operation with request and response types.
