package Buildship.Check30.BasicTestCoverage.Linux.buildTypes

import Buildship.EclipseBuildTemplate
import jetbrains.buildServer.configs.kotlin.v2018_1.BuildType

object Eclipse42 : BuildType({
    id("Basic_Test_Coverage_Linux_Eclipse42_java8_30")
    name = "Basic Test Coverage (Linux, Eclipse 4.2, Java 8)"

    templates(EclipseBuildTemplate)

    params {
        param("eclipse.version", "42")
        param("compiler.location", "%linux.java8.oracle.64bit%/bin/javac")
        param("eclipse.test.java.home", "%linux.java8.oracle.64bit%")
        param("gradle.tasks", "clean eclipseTest")
    }

    requirements {
        contains("teamcity.agent.jvm.os.name", "Linux", "RQ_171")
    }
})