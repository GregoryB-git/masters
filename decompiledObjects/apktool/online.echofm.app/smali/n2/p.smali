.class public final synthetic Ln2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/M$b;


# instance fields
.field public final synthetic a:Ln2/M;


# direct methods
.method public synthetic constructor <init>(Ln2/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln2/p;->a:Ln2/M;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln2/p;->a:Ln2/M;

    .line 2
    .line 3
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ln2/M;->I(Ln2/M;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
