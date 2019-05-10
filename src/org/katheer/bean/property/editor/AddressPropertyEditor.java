package org.katheer.bean.property.editor;

import org.katheer.bean.Address;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] add = text.split("-");
        Address address = new Address();
        address.setHno(add[0]);
        address.setStreet(add[1]);
        address.setVillage(add[2]);
        address.setDistrict(add[3]);
        address.setState(add[4]);
        address.setPin(add[5]);
        super.setValue(address);
    }
}
