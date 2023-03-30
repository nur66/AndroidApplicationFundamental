#RESOURCE

##String

- Cara Membuatnya
```
<resources>
    <integer name="maxPage">100</integer>
    <integer-array name="numbers">
        <item>100</item>
        <item>200</item>
        <item>300</item>
    </integer-array>
    <bool name="isProductionMode">true</bool>
    <color name="background">#FF0000</color>
</resources>
```

- Cara Memanggilnya
```
Log.i("ValueResource", resources.getInteger(R.integer.maxPage).toString())
Log.i("ValueResource", resources.getIntArray(R.array.numbers).joinToString(","))
Log.i("ValueResource", resources.getBoolean(R.bool.isProductionMode).toString())
Log.i("ValueResource", resources.getColor(R.color.background, theme).toString())
```

##String Array