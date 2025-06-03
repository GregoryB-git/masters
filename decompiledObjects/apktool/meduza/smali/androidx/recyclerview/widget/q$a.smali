.class public final Landroidx/recyclerview/widget/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:Ld0/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/c;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld0/c;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ld0/c;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/q$a;->a:Ld0/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
