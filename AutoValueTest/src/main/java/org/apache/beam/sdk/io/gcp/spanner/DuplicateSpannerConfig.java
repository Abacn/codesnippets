package org.apache.beam.sdk.io.gcp.spanner;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class DuplicateSpannerConfig {

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract DuplicateSpannerConfig build();
  }
}
