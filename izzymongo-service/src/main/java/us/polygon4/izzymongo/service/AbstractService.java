
package us.polygon4.izzymongo.service;

/*
 * IzzyMongo Database Viewer 
 * 
 * Copyright (C) 2013 Polygon4, and individual contributors
 * by the @authors tag.
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import us.polygon4.izzymongo.util.MongoTemplateContainer;


/**
 * Base service class
 * 
 * @author Mikhail Izrailov
 *
 */
@Service
public abstract class AbstractService {
	protected static final Logger LOG = LoggerFactory.getLogger(AbstractService.class);
	@Autowired protected MongoTemplateContainer mtContainer;
	
	public MongoTemplateContainer getMtContainer() {
		return mtContainer;
	}
	public void setMtContainer(MongoTemplateContainer mtContainer) {
		this.mtContainer = mtContainer;
	}
	
}
