       
       
  
        <div id="lotActionButtonPanel">Copy /delete lot </div>
        <div id="lotActionPanel" class="hide">
          <form method="post" id="lotHandler">  
            <input type="hidden" name="FORMACTION" value="2"/>
            <input type="hidden" name="lotIndexParam" value="${lotIndex}"/>
            <table> 
               <tr>
                <td></td>
                <td><label>Action</label></td>
                <td></td>
              </tr>
              <tr>
                <td><input type="radio" name="lotaction" value="TO_LOT" /></td>
                <td>Copy to lot</td>
                <td><select id="copyToLot" name="copyToLot">
                    <option value="NOLOT">${selectLabel}</option>
                    <c:forEach var="oneLot" items="${lots}" varStatus="rowCounter">
                      <c:if test="${rowCounter.count -1 != lotIndex}">
				      <%-- rowCount starts with 1, lotindex start with 0 that means: rowCount - 1 = lotindex[] --%>
					   <option value="${rowCounter.count - 1}">${oneLot.lotName}</option>		
				    </c:if>
                  </c:forEach>
                </select></td>
              </tr>
              <tr>
                  <td><input type="radio" name="lotaction" value="FROM_LOT" /></td>
                  <td>Copy from lot</td>
                  <td><select id="copyFromLot" name="copyFromLot">
                     <option value="NOLOT">${selectLabel}</option>
                     <c:forEach var="oneLot" items="${lots}" varStatus="rowCounter">
                        <c:if test="${rowCounter.count -1 != lotIndex}">
				         <%-- rowCount starts with 1, lotindex start with 0 that means: rowCount - 1 = lotindex[] --%>
					     <option value="${rowCounter.count - 1}">${oneLot.lotName}</option>		
				       </c:if>
                     </c:forEach>
                 </select></td>
              </tr>       
              <tr>
                 <td><input type="radio" name="lotaction" value="CONTRACTOR_TO_LOT" /></td>
                 <td>Copy contractor to lot</td>
                 <td><select id="copyContractorToLot" name="copyContractorToLot">
                    <option value="NOLOT">${selectLabel}</option>
                    <c:forEach var="oneLot" items="${lots}" varStatus="rowCounter">
                      <c:if test="${rowCounter.count -1 != lotIndex}">
				      <%-- rowCount starts with 1, lotindex start with 0 that means: rowCount - 1 = lotindex[] --%>
					   <option value="${rowCounter.count - 1}">${oneLot.lotName}</option>		
				     </c:if>
                   </c:forEach>
                </select></td>
              </tr>
              <tr>
                 <td><input type="radio" name="lotaction" value="CONTRACTOR_FROM_LOT" /></td>
                 <td>Copy contractor from lot</td>
                 <td><select id="copyContractorFromLot" name="copyContractorFromLot">
                     <option value="NOLOT">${selectLabel}</option>
                       <c:forEach var="oneLot" items="${lots}" varStatus="rowCounter">
                         <c:if test="${rowCounter.count -1 != lotIndex}">
				          <%-- rowCount starts with 1, lotindex start with 0 that means: rowCount - 1 = lotindex[] --%>
					     <option value="${rowCounter.count - 1}">${oneLot.lotName}</option>		
				          </c:if>
                      </c:forEach>
                 </select></td>
             </tr>
             <tr>
                <td><input type="radio" name="lotaction" value="DELETE_LOT" /></td>
                <td>Delete this lot</td>
                <td><input class="btn" name="submitHandelLot" id="submitHandelLot" type="submit" value="OK" /></td>
             </tr>
           </table>
         </form>
        </div>
 
