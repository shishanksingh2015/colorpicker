[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Color%20Picker-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/6244)
# colorpicker
A custom color picker that will pick colors from any image.

## Gradle 
    compile 'com.github.shishanksingh2015:colorpicker:v1.0'

## Maven
```xml
<dependency>
	    <groupId>com.github.shishanksingh2015</groupId>
	    <artifactId>colorpicker</artifactId>
	    <version>v1.0</version>
	</dependency>
```

## Implementation

Android Color picker, is a custom image or drawable color picker.It is very easy to use and customize.It track the color change continuously on moving picker and also on track color change on tap of color picker.

<img src="/gif/color_picker.gif" alt="Android Dial Number Picker" width= "250px"/>

## Usage
* In XML layout:
```xml

    <com.colorpicker.shishank.colorpicker.ColorPicker
        android:id="@+id/colorPicker"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
        
```
* Value Change Listener
```java
   colorPicker.setGradientView(R.drawable.color_picker);
        colorPicker.setColorSelectedListener(new ColorPicker.ColorSelectedListener() {
            @Override
            public void onColorSelected(@ColorInt int color, boolean isTapUp) {
                imageView.setBackgroundColor(color);
                if (isTapUp) {
                    Toast.makeText(MainActivity.this, "On Tap Up called", Toast.LENGTH_SHORT).show();
                }
            }
        });
```        
Please feel free to contribute by pull request, issues or feature requests.
