.class public final Lub/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lub/h$c<",
        "Lub/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic a:Lub/f$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lub/f$a;

    invoke-direct {v0}, Lub/f$a;-><init>()V

    sput-object v0, Lub/f$a;->a:Lub/f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
