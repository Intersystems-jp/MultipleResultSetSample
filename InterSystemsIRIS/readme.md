# 複数結果セットの取得：InterSystems IRIS版サンプル

[複数結果セットを一度に返す方法](https://jp.community.intersystems.com/node/499131)で登場するサンプルプログラムが含まれています。

## サンプルのセットアップ

1) 検索対象テーブルとデータの準備

サンプルコード（Java）からJDBC経由でストアドプロシージャを呼び出す際、Sample.Employee テーブルと Sample.Company テーブルを利用しています。

これらクラス定義一式とデータ作成方法について詳しくは、[サンプル（Sample.Person）のクラス定義ダウンロードとサンプルデータの作成について](https://jp.community.intersystems.com/node/495332) をご参照ください。


2) クラス定義　devcon2008.MultipleResultSetSample.xml　のインポート

スタジオでインポートする場合は、スタジオを開き Sample.Employee と Sample.Company が含まれるネームスペースに接続し

**ツール→ローカルからインポート** より devcon2008.MultipleResultSetSample.xml をインポートします。

>または、XMLファイルをスタジオのエリアにドラッグし、ドロップする方法でもインポートできます。

管理ポータルを利用する場合は、**管理ポータル > システムエクスプローラ > クラス** に移動し、Sample.Employee と Sample.Company が含まれるネームスペースを選択し「インポート」ボタンをクリックし、サンプルのXMLファイルを指定してインポートを実行します。


## Java サンプルの実行

**実行前に、InterSystems IRISのjdbc用jarファイルをClassPathへ登録する必要があります。**
詳しくは[ドキュメント](https://docs.intersystems.com/irislatestj/csp/docbook/DocBook.UI.Page.cls?KEY=AFL_C2460)をご参照ください。


また、[サンプル 10行目](./MultiRS.java#L10)にある JDBC の接続文字列に指定している IRIS のポート番号をご確認ください（サンプルでは、51773 を指定しています）。

事前準備が完了したら、[MultiRS.java](./MultiRS.java) を実行します。