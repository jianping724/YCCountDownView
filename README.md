# YCCountDownView自定义倒计时器
- 01.该库基础介绍
- 02.该库使用方法
- 03.



### 01.该库基础介绍
- 启动页倒计时自定义控件


### 02.该库使用方法
- 导入库：compile 'cn.yc:YCCountDownViewLib:1.0.1'
- 第一步：写布局
    ```
    <com.ns.yc.yccountdownviewlib.CountDownView
        android:id="@+id/cdv_time"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_marginTop="40dp"
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
