.class public final synthetic Lv3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/q;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/p;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv3/p;->a:Landroid/content/Context;

    new-instance v1, Lz4/j;

    new-instance v2, Lc4/f;

    invoke-direct {v2}, Lc4/f;-><init>()V

    invoke-direct {v1, v0, v2}, Lz4/j;-><init>(Landroid/content/Context;Lc4/f;)V

    return-object v1
.end method
