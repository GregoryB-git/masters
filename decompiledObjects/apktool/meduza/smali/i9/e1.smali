.class public final synthetic Li9/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li9/h1;


# direct methods
.method public synthetic constructor <init>(Li9/h1;I)V
    .locals 0

    iput p2, p0, Li9/e1;->a:I

    iput-object p1, p0, Li9/e1;->b:Li9/h1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Li9/e1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Li9/e1;->b:Li9/h1;

    .line 8
    .line 9
    iget-object v1, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    const-string v2, "CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 17
    .line 18
    const-string v2, "CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 24
    .line 25
    const-string v1, "CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_0
    iget-object v0, p0, Li9/e1;->b:Li9/h1;

    .line 32
    .line 33
    iget-object v0, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 34
    .line 35
    const-string v1, "CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
