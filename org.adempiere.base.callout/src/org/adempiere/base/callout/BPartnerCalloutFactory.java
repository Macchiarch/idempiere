/******************************************************************************
 * Copyright (C) 2013 Diego Ruiz                                              *
 * Copyright (C) 2013 Trek Global                                             *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.adempiere.base.callout;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.adempiere.model.CalloutBPartnerQuickEntry;
import org.compiere.model.MBPartner;

public class BPartnerCalloutFactory implements IColumnCalloutFactory {

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		if (tableName.equalsIgnoreCase(MBPartner.Table_Name)
			&& MBPartner.COLUMNNAME_C_BPartner_ID.equalsIgnoreCase(columnName)) { 
			return new IColumnCallout[]{new CalloutBPartnerQuickEntry()};
		}
		return null;
	}
}