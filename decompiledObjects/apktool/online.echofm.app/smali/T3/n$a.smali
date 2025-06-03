.class public LT3/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT3/n;->W(Z)LV2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV2/k;

.field public final synthetic b:LT3/n;


# direct methods
.method public constructor <init>(LT3/n;LV2/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT3/n$a;->b:LT3/n;

    .line 2
    .line 3
    iput-object p2, p0, LT3/n$a;->a:LV2/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LT3/n$a;->a:LV2/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LV2/k;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
