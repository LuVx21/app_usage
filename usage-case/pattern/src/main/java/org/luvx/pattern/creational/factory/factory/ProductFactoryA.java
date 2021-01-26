package org.luvx.pattern.creational.factory.factory;

import org.luvx.pattern.creational.factory.bean.FactoryInter;
import org.luvx.pattern.creational.factory.bean.Product;
import org.luvx.pattern.creational.factory.bean.ProductA;

/**
 * 工厂方法模式
 * <p>
 * 为解决简单工厂模式中工厂类的臃肿问题,每种产品都由一个工厂创建
 * 基于这样的实现,增加产品时,同时创建该产品的工厂类
 * 因此,在产品很多的情况下,类的数量是原来的两倍(产品类和工厂类)
 */
public class ProductFactoryA implements FactoryInter {
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
