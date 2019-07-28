package com.hw.videoprocessor.util;

import androidx.annotation.Nullable;

/**
 * Created by huangwei on 2018/4/17 0017.
 */

public interface VideoProgressListener {
    default void onProgress(float progress) {}

    default void onError(@Nullable Exception e) {}

    default void onComplete() {}
}
