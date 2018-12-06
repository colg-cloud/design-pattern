/**
 * 装饰模式
 * 
 * <pre>
 * 软件公司欲开发了一个数据加密模块，可以对字符串进行加密。
 * 最简单的加密算法通过对字母进行移位来实现，同时还提供了稍复杂的逆向输出加密，还提供了更为高级的MD5加密。
 * 用户先使用最简单的加密算法对字符串进行加密，如果觉得还不够可以对加密之后的结果使用其他加密算法进行二次加密，当然也可以进行第三次加密。
 * 试使用装饰模式设计该多重加密系统。
 * </pre>
 *
 * @author colg
 */
package cn.colg.learn._01;