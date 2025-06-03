.class public final synthetic Ln2/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/M$b;


# instance fields
.field public final synthetic a:Ln2/M;

.field public final synthetic b:Lf2/p;


# direct methods
.method public synthetic constructor <init>(Ln2/M;Lf2/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln2/L;->a:Ln2/M;

    .line 5
    .line 6
    iput-object p2, p0, Ln2/L;->b:Lf2/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln2/L;->a:Ln2/M;

    .line 2
    .line 3
    iget-object v1, p0, Ln2/L;->b:Lf2/p;

    .line 4
    .line 5
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Ln2/M;->i(Ln2/M;Lf2/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
