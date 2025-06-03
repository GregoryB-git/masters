.class public final enum Lb7/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb7/b;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb7/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic b:[Lb7/b;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lb7/b;

    const-string v1, "PLATFORM"

    const/4 v2, 0x0

    const-string v3, "platform"

    invoke-direct {v0, v1, v2, v3}, Lb7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lb7/b;

    const-string v3, "CROSS_PLATFORM"

    const/4 v4, 0x1

    const-string v5, "cross-platform"

    invoke-direct {v1, v3, v4, v5}, Lb7/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    const/4 v3, 0x2

    new-array v3, v3, [Lb7/b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lb7/b;->b:[Lb7/b;

    new-instance v0, Lb7/h0;

    invoke-direct {v0}, Lb7/h0;-><init>()V

    sput-object v0, Lb7/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb7/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb7/b;
    .locals 1

    const-class v0, Lb7/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb7/b;

    return-object p0
.end method

.method public static values()[Lb7/b;
    .locals 1

    sget-object v0, Lb7/b;->b:[Lb7/b;

    invoke-virtual {v0}, [Lb7/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb7/b;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb7/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lb7/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
