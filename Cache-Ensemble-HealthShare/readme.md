# 複数結果セットの取得例：Cache／Ensemble／HealthShare版サンプル

[複数結果セットを一度に返す方法](https://jp.community.intersystems.com/node/499131)で登場するサンプルプログラムが含まれています。

## サンプルのセットアップ

1) 動作バージョン

バージョン2010.2以降で動作します。

2) クラス定義　devcon2008.MultipleResultSetSample.xml　のインポート

スタジオでインポートする場合は、スタジオを開き SAMPLES ネームスペースに接続し

**ツール→ローカルからインポート**　より devcon2008.MultipleResultSetSample.xml をインポートします。

>または、XMLファイルをスタジオのエリアにドラッグし、ドロップする方法でもインポートできます。

管理ポータルを利用する場合は、**管理ポータル > システムエクスプローラ > クラス** に移動し、SAMPLES ネームスペースを選択し「インポート」ボタンをクリックし、サンプルのXMLファイルを指定してインポートを実行します。

## Javaサンプルの実行

**実行前に、弊社製品のJDBC用JARファイルをClassPathへ登録する必要があります。**
詳しくは[ドキュメント](https://docs.intersystems.com/latestj/csp/docbook/DocBook.UI.Page.cls?KEY=BGJD_intro#BGJD_intro_packages) をご参照ください。

また、[サンプル 10行目](./MultiRS.java#L10)にある JDBC の接続文字列に指定しているポート番号をご確認ください（サンプルでは、1972 を指定しています）。

事前準備が完了したら、[MultiRS.java](./MultiRS.java) を実行します。




