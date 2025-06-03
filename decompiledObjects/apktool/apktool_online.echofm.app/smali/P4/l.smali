.class public final synthetic LP4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final synthetic a:LP4/m;


# direct methods
.method public synthetic constructor <init>(LP4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP4/l;->a:LP4/m;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/l;->a:LP4/m;

    .line 2
    .line 3
    invoke-static {v0, p1}, LP4/m;->b(LP4/m;LV2/j;)Z

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
