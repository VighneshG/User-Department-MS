package com.vighnesh.cloud.gateway.controller;

import io.github.resilience4j.retry.annotation.Retry;

@Retry(name = "fallBack")
public class FallBackController {

}
