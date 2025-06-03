.class public LV3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/b;->f(LV3/k;LV3/b;)LV3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/k;

.field public final synthetic b:LV3/b;


# direct methods
.method public constructor <init>(LV3/b;LV3/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/b$a;->b:LV3/b;

    .line 2
    .line 3
    iput-object p2, p0, LV3/b$a;->a:LV3/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LV3/k;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ld4/n;

    .line 2
    .line 3
    check-cast p3, LV3/b;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, LV3/b$a;->b(LV3/k;Ld4/n;LV3/b;)LV3/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public b(LV3/k;Ld4/n;LV3/b;)LV3/b;
    .locals 1

    .line 1
    iget-object v0, p0, LV3/b$a;->a:LV3/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV3/k;->T(LV3/k;)LV3/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p3, p1, p2}, LV3/b;->a(LV3/k;Ld4/n;)LV3/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
