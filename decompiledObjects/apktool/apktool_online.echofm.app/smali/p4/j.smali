.class public final synthetic Lp4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# instance fields
.field public final a:Lp4/k;


# direct methods
.method public constructor <init>(Lp4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp4/j;->a:Lp4/k;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LV2/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/j;->a:Lp4/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp4/k;->h(LV2/j;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
