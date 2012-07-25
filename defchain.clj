(defmacro defchain [name functions]
  "create a chain of calls among functions inside 'functions' vector.
   it will stop at the first function that isn't able to handle the value.
   pattern: chain of responsability."
  `(let [chain-call# (reduce wrap ~functions)]
     (def ~(symbol name) chain-call#)))

;; Example of use:
;; (defchain name-my-var [function1 function2 function3]