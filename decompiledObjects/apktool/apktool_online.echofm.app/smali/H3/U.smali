.class public final synthetic LH3/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:LH3/V;


# direct methods
.method public synthetic constructor <init>(LH3/V;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH3/U;->a:LH3/V;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LH3/U;->a:LH3/V;

    .line 2
    .line 3
    invoke-static {v0, p1}, LH3/V;->b(LH3/V;LV2/j;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
