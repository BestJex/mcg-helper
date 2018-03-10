/*
 * @Copyright (c) 2018 缪聪(mcg-helper@qq.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");  
 * you may not use this file except in compliance with the License.  
 * You may obtain a copy of the License at  
 *     
 *     http://www.apache.org/licenses/LICENSE-2.0  
 *     
 * Unless required by applicable law or agreed to in writing, software  
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 * See the License for the specific language governing permissions and  
 * limitations under the License.
 */

package com.mcg.plugin.build;

import java.util.ArrayList;

public class McgConcreteBuilder extends McgBuilder {
    private McgProduct mcgProduct;
    
    public McgConcreteBuilder(McgProduct mcgProduct, ArrayList<String> sequence) {
        this.mcgProduct = mcgProduct;
        setSequence(sequence);
    }
    
    @Override
    public McgProduct getMcgProduct() {
        return this.mcgProduct;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.mcgProduct.setSequence(sequence);
    }

}
