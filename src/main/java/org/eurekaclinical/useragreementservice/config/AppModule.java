package org.eurekaclinical.useragreementservice.config;

/*-
 * #%L
 * Eureka! Clinical User Agreement Service
 * %%
 * Copyright (C) 2016 Emory University
 * %%
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
 * #L%
 */

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.eurekaclinical.standardapis.dao.UserDao;
import org.eurekaclinical.standardapis.entity.RoleEntity;
import org.eurekaclinical.standardapis.entity.UserEntity;

import org.eurekaclinical.useragreementservice.dao.JpaUserAgreementDao;
import org.eurekaclinical.useragreementservice.dao.JpaUserDao;
import org.eurekaclinical.useragreementservice.dao.UserAgreementDao;

/**
 * @author arpost
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(UserAgreementDao.class).to(JpaUserAgreementDao.class);
        bind(new TypeLiteral<UserDao<? extends UserEntity<? extends RoleEntity>>>() {}).to(JpaUserDao.class);
    }
}