.class public final synthetic LO5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/e;


# instance fields
.field public final synthetic a:LO5/x;

.field public final synthetic b:LE5/k$d;


# direct methods
.method public synthetic constructor <init>(LO5/x;LE5/k$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO5/r;->a:LO5/x;

    .line 5
    .line 6
    iput-object p2, p0, LO5/r;->b:LE5/k$d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, LO5/r;->a:LO5/x;

    .line 2
    .line 3
    iget-object v1, p0, LO5/r;->b:LE5/k$d;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LO5/x;->e(LO5/x;LE5/k$d;LV2/j;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
