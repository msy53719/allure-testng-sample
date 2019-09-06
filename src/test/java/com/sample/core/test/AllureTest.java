package com.sample.core.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
@Feature("接口测试")
public class AllureTest {
	@Test
	@Step("登录")
	@Story("111")
	public void test() {
		assertEquals(1, 1);
	}

	@Test
	@Step("注册")
	public void test1() {
		assertEquals(1, 1);
	}

	@Test
	@Step("修改")
	public void test2() {
		assertEquals(1, 1);
	}

	@Test
	public void test3() {
		assertEquals(1, 1);
	}
}
