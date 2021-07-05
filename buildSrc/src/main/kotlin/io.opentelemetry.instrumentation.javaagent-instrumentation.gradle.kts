plugins {
  id("io.opentelemetry.instrumentation.javaagent-testing")
  id("io.opentelemetry.instrumentation.muzzle-check")
}

dependencies {
  add("muzzleBootstrap", "io.opentelemetry.javaagent:opentelemetry-javaagent-bootstrap")
  add("muzzleTooling", "io.opentelemetry.javaagent:opentelemetry-javaagent-tooling")
  add("muzzleTooling", "io.opentelemetry.javaagent:opentelemetry-javaagent-extension-api")
}
