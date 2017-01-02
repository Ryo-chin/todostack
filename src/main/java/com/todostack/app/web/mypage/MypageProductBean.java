package com.todostack.app.web.mypage;

import com.todostack.dbflute.exentity.Product;
import org.lastaflute.core.util.Lato;
import org.lastaflute.web.validation.Required;

/**
 * @author jflute
 */
public class MypageProductBean {

    @Required
    public final String productName;
    @Required
    public final Integer regularPrice;

    public MypageProductBean(Product product) {
        this.productName = product.getProductName();
        this.regularPrice = product.getRegularPrice();
    }

    @Override
    public String toString() {
        return Lato.string(this);
    }
}
