# Auto-value generates duplicate sources in dependencies

To reproduce, run `mvn compile`

Expected: only AutoValue_DuplicateSpannerConfig in `target/classes/org/apache/beam/sdk/io/gcp/spanner/`

Actual: there are many AutoValue_* classes, seemingly regenerated from binaries in `beam-sdks-java-io-google-cloud-platform`
    in `target/classes/org/apache/beam/sdk/io/gcp/spanner/`.

Comment: this has caused inconsistent class path in DataflowTemplates: https://github.com/GoogleCloudPlatform/DataflowTemplates/issues/1362
