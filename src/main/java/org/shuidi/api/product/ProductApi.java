/*
 * Copyright 2016 ShuiDi(Drop Of Water/DOW).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.shuidi.api.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author houyefeng
 * @version 0.0.0
 * @since 0.0.0 2016-05-05
 */
@Controller
@RequestMapping(value = "/product")
public class ProductApi {
    /**
     * 显示单个商品
     *
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object get(@PathVariable("id") Long id) {

        Map<String, Object> product = new HashMap<>();
        product.put("name", "商品1");
        product.put("price", Double.valueOf("10.5"));

        return product;
    }

    /**
     * 保存新增
     *
     * @param bean 要保存的实体
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object save(HttpServletRequest request, HttpServletResponse response, Object bean) {
        return null;
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Object delete(@PathVariable("id") Long id) {
        return null;
    }


    /**
     * 保存更新
     * @return
     */
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    @ResponseBody
    public Object update() {
        return null;
    }
}
