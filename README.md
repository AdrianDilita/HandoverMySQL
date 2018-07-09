# HandoverMySQL

The idea of the project is to create a web app that ruins the formatting of SQL code provided by the user, without affecting the output of the code 
and still leaving it readable by the machine

The website header:
Is your SQL code properly formatted? 
Correctly indentated, easy to read and highly performant?

Not sure if you've missed an important tweak that might improve your stored procedure even further?

Worry not, HandoverMySQL will help you properly prepare your code by removing indentations, placing vague random notes that provide no help, 
randomly removing nolocks and aliases, adding comment blocks referencing alpha code that's been removed, replacing joins with nested select queries 
or removing any traces of indexes.

 Ever wanted to experience what it was like to read the inherited SQL code of a different company in a handover?

 The wait is over! Just paste your code in the text box below and click "Improve!"



Implementation ideas:
1. Place random comment sections with certain text

/*         text


             */
2. Randomly remove aliases and replace them with the full table name
     Careful with doing this, you can only replace aliases without removing the AS, but not the other way around
Ex.
        SELECT
		A.ID_COMPANY
		,PM_DIM_PROMOTION.ID_BACKOFFICE
		,PM_DIM_PROMOTION.ID_L_ITEM
		,PM_DIM_PROMOTION.STARTWEEK
		,A.ENDWEEK
		--,CEILING(REVIEWED_TSU / CAST(WEEK_CNT AS DECIMAL)) TSU_PERWEEK
		 ,CAST(ROUND(CAST(A.REVIEWED_TSU AS DECIMAL) / CAST(A.WEEK_CNT AS DECIMAL), 0) AS INT) AS TSU_PERWEEK
		,PM_DIM_PROMOTION.PROMOTION_KEY
		,A.ID_PROMOTION_TYPE
        FROM PM_DIM_PROMOTION AS A
        
3. Remove (nolock)s randomly
4. Place notes at the beginning of the code with very old dates and vague/unhelpul comments regarding changes
5. Place crosslinks? (tricky, depends on code)
6. Randomy indentate lines
7. Replace joins with nested selects
8. Randomly remove indexes or place new indexes where none are needed
