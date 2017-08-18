package com.owen.updownswiperefreshlayout.customView;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;

/**
 * 自定义SwipeRefreshLayout ，实现下拉刷新，上拉加载  RecyclerView  一起实现
 * Created by owen on 2017/8/18.
 *  1、加入上拉刷新的底部布局
 *  2、onLayout() 中获取 Listview  注意：listview放在SwipeRefreshLayout内部，为子控件
 *  3、当listview滑动到最后一条数据时，加载数据
 *  4、分发事件处理
 */

public class UpDownSwipeRefreshLayout extends SwipeRefreshLayout {
    //刷新状态  TRUE 表示正在刷新
    private boolean isRefreshing;
    //上下文
    private Context mContext;


    public UpDownSwipeRefreshLayout(Context context) {
        super(context);
        this.mContext = context;
    }

    public UpDownSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);




    }
}
