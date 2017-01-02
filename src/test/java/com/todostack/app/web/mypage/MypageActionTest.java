package com.todostack.app.web.mypage;

import org.dbflute.utflute.lastaflute.mock.TestingHtmlData;
import com.todostack.unit.UnitTodostackTestCase;
import org.lastaflute.web.response.HtmlResponse;

/**
 * @author jflute
 */
public class MypageActionTest extends UnitTodostackTestCase {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mockLogin();
    }

    public void test_index() {
        // ## Arrange ##
        MypageAction action = new MypageAction();
        inject(action);

        // ## Act ##
        HtmlResponse response = action.index();

        // ## Assert ##
        TestingHtmlData data = validateHtmlData(response);
        data.requiredList("recentProducts", MyPageTaskBean.class).forEach(bean -> {
            log(bean);
        });
    }
}
