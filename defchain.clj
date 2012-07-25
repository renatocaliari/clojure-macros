(defmacro defchain [name functions]
  "create a chain of calls among functions inside 'body'.
   it will stop in the first function that it isn't able to handle the value.
   pattern: chain of responsability."
  `(let [chain-call# (reduce wrap ~functions)]
     (def ~(symbol name) chain-call#)))
