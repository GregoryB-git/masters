.class public final synthetic Ln2/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/M$d;


# instance fields
.field public final synthetic a:Ln2/U;


# direct methods
.method public synthetic constructor <init>(Ln2/U;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln2/E;->a:Ln2/U;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln2/E;->a:Ln2/U;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
