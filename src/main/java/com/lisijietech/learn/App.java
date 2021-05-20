package com.lisijietech.learn;

/**
 * 自动转换换行符。
 * 在初次clone远程仓库时，要注意git的换行符配置。是自动转换还是原样等。由于不同系统默认换行符的不同。
 * 小问题，但存在，会导致初次clone代码，所有文件内容换行符被替换为默认系统的，git会标识所有代码都被修改过。
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //同账号、同pc、同项目、不同目录中clone工程，分别push，能否检测出冲突，文件版本索引是否唯一可用测试。
        System.out.println( "测试" );
    }
}
