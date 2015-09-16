java_binary(
    name = "echo",
    srcs = glob(["**/*.java"]),
    main_class = "west.Echo",
)

java_library(
    name = "test_classes",
    srcs = glob(["src/main/java/**/*.java"]),
)

java_test(
    name = "echo_test",
    srcs = glob(["src/test/java/west/*.java"]),
    deps = [
        ":test_classes",
        "//third_party:junit4",
    ],
)