package com.kino.designpattern.facotry;

import com.kino.designpattern.facotry.Video;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-07-24
 */

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java课程");
    }
}
