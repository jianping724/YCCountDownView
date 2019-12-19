# YCCountDownView自定义倒计时器
- 01.该库基础介绍
- 02.该库使用方法
- 03.关于其他介绍



### 01.该库基础介绍
- 启动页倒计时自定义控件，可以自定义倒计时单位，时间；可以自定义倒计时开始角度；主要应用场景是启动页倒计时。


### 02.该库使用方法
- 第一步：写布局
    ```
    <com.ns.yc.lib.CountDownView
        android:id="@+id/cdv_time"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:layout_marginRight="20dp"
        app:cd_animator_time="3"
        app:cd_animator_time_unit="秒"
        app:cd_arc_color="@color/blackText"
        app:cd_arc_width="2dp"
        app:cd_bg_color="@color/whiteBg"
        app:cd_circle_radius="20dp"
        app:cd_location="top"
        app:cd_retreat_type="forward"
        app:cd_text_color="@color/blackText"
        app:cd_text_size="9sp" />
    ```
- 第二步：使用
    ```
    private void initCountDownView() {
        cdvTime.setTime(5);
        cdvTime.start();
        cdvTime.setOnLoadingFinishListener(new CountDownView.OnLoadingFinishListener() {
            @Override
            public void finish() {
                Toast.makeText(MainActivity.this,"完成倒计时",Toast.LENGTH_SHORT).show();
            }
        });
        cdvTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cdvTime.stop();
            }
        });
    }
    ```



### 3.其他说明
#### 3.1 其他推荐说明
- 1.[技术博客汇总](https://www.jianshu.com/p/614cb839182c)
- 2.[开源项目汇总](https://blog.csdn.net/m0_37700275/article/details/80863574)
- 3.[生活博客汇总](https://blog.csdn.net/m0_37700275/article/details/79832978)
- 4.[喜马拉雅音频汇总](https://www.jianshu.com/p/f665de16d1eb)
- 5.[其他汇总](https://www.jianshu.com/p/53017c3fc75d)
- 6.[重点推荐：博客笔记大汇总，开源文件都是md格式](https://github.com/yangchong211/YCBlogs)



#### 3.2 关于LICENSE
```
Copyright 2017 yangchong211（github.com/yangchong211）

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

