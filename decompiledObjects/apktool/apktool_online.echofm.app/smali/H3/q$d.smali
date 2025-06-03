.class public LH3/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/q;->a0(LV2/j;)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV2/j;

.field public final synthetic b:LH3/q;


# direct methods
.method public constructor <init>(LH3/q;LV2/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/q$d;->b:LH3/q;

    .line 2
    .line 3
    iput-object p2, p0, LH3/q$d;->a:LV2/j;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)LV2/j;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LH3/q$d;->b(Ljava/lang/Boolean;)LV2/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Ljava/lang/Boolean;)LV2/j;
    .locals 2

    .line 1
    iget-object v0, p0, LH3/q$d;->b:LH3/q;

    .line 2
    .line 3
    invoke-static {v0}, LH3/q;->m(LH3/q;)LH3/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LH3/q$d$a;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LH3/q$d$a;-><init>(LH3/q$d;Ljava/lang/Boolean;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LH3/n;->i(Ljava/util/concurrent/Callable;)LV2/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
