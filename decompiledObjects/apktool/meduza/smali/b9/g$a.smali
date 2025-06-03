.class public final Lb9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz8/a<",
        "Lb9/g$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lb9/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb9/f;

    invoke-direct {v0}, Lb9/f;-><init>()V

    sput-object v0, Lb9/g$a;->a:Lb9/f;

    return-void
.end method
