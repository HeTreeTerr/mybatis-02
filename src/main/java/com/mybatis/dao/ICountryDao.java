package com.mybatis.dao;

import com.mybatis.beans.Country;

public interface ICountryDao {

	Country selectCountryById(int id);

	Country selectCountryById1(int id);
}
