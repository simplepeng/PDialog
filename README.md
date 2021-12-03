# PDialog

[![](https://jitpack.io/v/simplepeng/NiceDialog.svg)](https://jitpack.io/#simplepeng/NiceDialog)

## 依赖

```groovy
maven { url 'https://jitpack.io' }
```

```groovy
implementation 'com.github.simplepeng:PDialog:v1.0.0'
```

## PDialog系列

| 方法名          | 作用                                                  |
| :-------------- | ----------------------------------------------------- |
| setWidth        | 设置宽                                                |
| setHeight       | 设置高                                                |
| setDimAmount    | 设置背景颜色比例（0-1f）                              |
| setGravity      | 设置弹出位置                                          |
| setAnimRes      | 设置出入动画                                          |
| isShowSoftInput | 自动显示软键盘-9.0以上需要调用EditText.requestFocus() |
| isNotTouchModel | 透传手势事件                                          |

## PBottomDialog

带动画进出的底部Dialog

默认从底部渐入渐出弹出，宽度为`MATCH_PARENT`

## PFullDialog

全屏Dialog

| 方法名    | 作用           |
| --------- | -------------- |
| isHideBar | 是否隐藏状态栏 |

## PDialogFragment系列

使用方法同上

新增`showAllowingStateLoss`，`setOnShowListener`，`setOnDismissListener`，等方法

## 反馈Q群

* 1078185041

## 版本迭代

* v1.0.0：首次上传