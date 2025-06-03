.class public abstract Lv3/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Lw3/v;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/i1;->a:Ljava/lang/String;

    new-instance v0, Lw3/v;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lw3/v;-><init>(I)V

    sput-object v0, Lv3/i1;->b:Lw3/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
