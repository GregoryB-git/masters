.class public LV3/u$a;
.super Ld4/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/u;->c(LV3/k;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/k;

.field public final synthetic b:LV3/u;


# direct methods
.method public constructor <init>(LV3/u;LV3/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/u$a;->b:LV3/u;

    .line 2
    .line 3
    iput-object p2, p0, LV3/u$a;->a:LV3/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ld4/c$c;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(Ld4/b;Ld4/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/u$a;->b:LV3/u;

    .line 2
    .line 3
    iget-object v1, p0, LV3/u$a;->a:LV3/k;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, LV3/k;->U(Ld4/b;)LV3/k;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1, p2}, LV3/u;->d(LV3/k;Ld4/n;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
