# Exercises

1. Try and compile `milk` `0.1.0`:
   - Checkout the `milk-v0.1.0` tag. 

   ```
   cd milk
   sbt compile
   ```
2. On the same `milk-v0.1.0` branch, try and compile `tea`:

   ```
   cd tea
   sbt compile
   ```
   
   Why can you not compile `tea`?
   
   Resolve the issue, then compile `coffee`.
   
3. Checkout the `milk-v0.2.0` branch.
   Compile `coffee`, resolving any issues.
   
   Run `coffee`. What causes the error?

4. In your global sbt plugins (`.sbt/1.0/plugins.sbt`), add the dependency tree plugin:

   ```
   addDependencyTreePlugin
   ```
   Use it to inspect the dependency tree



