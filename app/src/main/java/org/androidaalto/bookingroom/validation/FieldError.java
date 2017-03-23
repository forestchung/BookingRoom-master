/**
   Copyright: 2011 Android Aalto

   This file is part of BookingRoom.

   BookingRoom is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   BookingRoom is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with BookingRoom. If not, see <http://www.gnu.org/licenses/>.
 */

package org.androidaalto.bookingroom.validation;

/**
 * Class for modeling an error on a certain field in an object.
 * 
 * @author hannu
 */
public class FieldError extends ObjectError {
    private final String field;

    public FieldError(Object target, String field, String code, String message) {
        super(target, code, message);
        this.field = field;
    }

    public String getField() {
        return field;
    }
}